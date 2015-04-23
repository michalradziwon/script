
  package gen;
  public class Z_Gen156 {
  		@com.google.inject.Inject
  		public Z_Gen156(Z_Gen157 z_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
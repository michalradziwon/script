
  package gen;
  public class R_Gen156 {
  		@com.google.inject.Inject
  		public R_Gen156(R_Gen157 r_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
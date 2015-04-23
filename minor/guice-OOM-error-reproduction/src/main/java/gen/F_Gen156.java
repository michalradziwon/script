
  package gen;
  public class F_Gen156 {
  		@com.google.inject.Inject
  		public F_Gen156(F_Gen157 f_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
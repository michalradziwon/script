
  package gen;
  public class U_Gen156 {
  		@com.google.inject.Inject
  		public U_Gen156(U_Gen157 u_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
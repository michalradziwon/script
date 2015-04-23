
  package gen;
  public class C_Gen156 {
  		@com.google.inject.Inject
  		public C_Gen156(C_Gen157 c_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
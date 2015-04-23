
  package gen;
  public class C_Gen100 {
  		@com.google.inject.Inject
  		public C_Gen100(C_Gen101 c_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
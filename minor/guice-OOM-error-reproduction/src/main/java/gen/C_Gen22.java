
  package gen;
  public class C_Gen22 {
  		@com.google.inject.Inject
  		public C_Gen22(C_Gen23 c_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
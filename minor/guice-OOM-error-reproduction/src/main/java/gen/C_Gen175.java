
  package gen;
  public class C_Gen175 {
  		@com.google.inject.Inject
  		public C_Gen175(C_Gen176 c_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
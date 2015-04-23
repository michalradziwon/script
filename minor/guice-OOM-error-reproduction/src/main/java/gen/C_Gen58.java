
  package gen;
  public class C_Gen58 {
  		@com.google.inject.Inject
  		public C_Gen58(C_Gen59 c_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
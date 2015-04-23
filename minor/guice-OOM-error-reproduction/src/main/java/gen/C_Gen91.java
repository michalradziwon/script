
  package gen;
  public class C_Gen91 {
  		@com.google.inject.Inject
  		public C_Gen91(C_Gen92 c_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
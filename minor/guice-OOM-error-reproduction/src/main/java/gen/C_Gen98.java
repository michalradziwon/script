
  package gen;
  public class C_Gen98 {
  		@com.google.inject.Inject
  		public C_Gen98(C_Gen99 c_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
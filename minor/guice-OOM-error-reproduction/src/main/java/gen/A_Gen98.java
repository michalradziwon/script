
  package gen;
  public class A_Gen98 {
  		@com.google.inject.Inject
  		public A_Gen98(A_Gen99 a_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
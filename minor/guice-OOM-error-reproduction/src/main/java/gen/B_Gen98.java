
  package gen;
  public class B_Gen98 {
  		@com.google.inject.Inject
  		public B_Gen98(B_Gen99 b_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
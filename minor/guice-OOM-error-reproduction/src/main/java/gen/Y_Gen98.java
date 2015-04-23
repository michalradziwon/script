
  package gen;
  public class Y_Gen98 {
  		@com.google.inject.Inject
  		public Y_Gen98(Y_Gen99 y_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
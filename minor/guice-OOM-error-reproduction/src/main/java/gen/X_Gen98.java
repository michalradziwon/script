
  package gen;
  public class X_Gen98 {
  		@com.google.inject.Inject
  		public X_Gen98(X_Gen99 x_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
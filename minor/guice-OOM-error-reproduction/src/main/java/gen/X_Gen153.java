
  package gen;
  public class X_Gen153 {
  		@com.google.inject.Inject
  		public X_Gen153(X_Gen154 x_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  

  package gen;
  public class Y_Gen153 {
  		@com.google.inject.Inject
  		public Y_Gen153(Y_Gen154 y_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
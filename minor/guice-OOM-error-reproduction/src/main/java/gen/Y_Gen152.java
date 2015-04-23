
  package gen;
  public class Y_Gen152 {
  		@com.google.inject.Inject
  		public Y_Gen152(Y_Gen153 y_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  

  package gen;
  public class Y_Gen173 {
  		@com.google.inject.Inject
  		public Y_Gen173(Y_Gen174 y_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
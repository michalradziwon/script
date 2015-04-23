
  package gen;
  public class Y_Gen82 {
  		@com.google.inject.Inject
  		public Y_Gen82(Y_Gen83 y_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
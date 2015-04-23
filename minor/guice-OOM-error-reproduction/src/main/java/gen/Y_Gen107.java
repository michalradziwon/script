
  package gen;
  public class Y_Gen107 {
  		@com.google.inject.Inject
  		public Y_Gen107(Y_Gen108 y_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  

  package gen;
  public class Y_Gen159 {
  		@com.google.inject.Inject
  		public Y_Gen159(Y_Gen160 y_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
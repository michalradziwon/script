
  package gen;
  public class Y_Gen150 {
  		@com.google.inject.Inject
  		public Y_Gen150(Y_Gen151 y_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
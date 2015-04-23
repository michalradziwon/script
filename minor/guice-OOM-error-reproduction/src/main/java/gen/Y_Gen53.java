
  package gen;
  public class Y_Gen53 {
  		@com.google.inject.Inject
  		public Y_Gen53(Y_Gen54 y_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
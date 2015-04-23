
  package gen;
  public class Y_Gen151 {
  		@com.google.inject.Inject
  		public Y_Gen151(Y_Gen152 y_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
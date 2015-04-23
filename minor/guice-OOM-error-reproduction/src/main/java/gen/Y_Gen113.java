
  package gen;
  public class Y_Gen113 {
  		@com.google.inject.Inject
  		public Y_Gen113(Y_Gen114 y_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
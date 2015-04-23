
  package gen;
  public class Y_Gen13 {
  		@com.google.inject.Inject
  		public Y_Gen13(Y_Gen14 y_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
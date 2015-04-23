
  package gen;
  public class Y_Gen175 {
  		@com.google.inject.Inject
  		public Y_Gen175(Y_Gen176 y_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
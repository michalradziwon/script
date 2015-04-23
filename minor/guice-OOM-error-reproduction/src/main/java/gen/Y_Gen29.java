
  package gen;
  public class Y_Gen29 {
  		@com.google.inject.Inject
  		public Y_Gen29(Y_Gen30 y_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  

  package gen;
  public class Y_Gen48 {
  		@com.google.inject.Inject
  		public Y_Gen48(Y_Gen49 y_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
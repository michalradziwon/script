
  package gen;
  public class Y_Gen38 {
  		@com.google.inject.Inject
  		public Y_Gen38(Y_Gen39 y_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
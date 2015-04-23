
  package gen;
  public class W_Gen186 {
  		@com.google.inject.Inject
  		public W_Gen186(W_Gen187 w_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  

  package gen;
  public class H_Gen181 {
  		@com.google.inject.Inject
  		public H_Gen181(H_Gen182 h_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
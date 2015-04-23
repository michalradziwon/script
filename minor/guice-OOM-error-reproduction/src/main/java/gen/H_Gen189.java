
  package gen;
  public class H_Gen189 {
  		@com.google.inject.Inject
  		public H_Gen189(H_Gen190 h_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
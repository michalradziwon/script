
  package gen;
  public class H_Gen175 {
  		@com.google.inject.Inject
  		public H_Gen175(H_Gen176 h_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
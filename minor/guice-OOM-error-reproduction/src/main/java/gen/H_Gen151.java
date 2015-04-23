
  package gen;
  public class H_Gen151 {
  		@com.google.inject.Inject
  		public H_Gen151(H_Gen152 h_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
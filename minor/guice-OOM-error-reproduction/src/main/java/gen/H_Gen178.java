
  package gen;
  public class H_Gen178 {
  		@com.google.inject.Inject
  		public H_Gen178(H_Gen179 h_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
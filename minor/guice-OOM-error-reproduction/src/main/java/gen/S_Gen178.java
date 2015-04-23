
  package gen;
  public class S_Gen178 {
  		@com.google.inject.Inject
  		public S_Gen178(S_Gen179 s_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
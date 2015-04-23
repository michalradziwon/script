
  package gen;
  public class B_Gen178 {
  		@com.google.inject.Inject
  		public B_Gen178(B_Gen179 b_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
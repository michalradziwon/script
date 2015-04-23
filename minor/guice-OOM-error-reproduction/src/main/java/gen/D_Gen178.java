
  package gen;
  public class D_Gen178 {
  		@com.google.inject.Inject
  		public D_Gen178(D_Gen179 d_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
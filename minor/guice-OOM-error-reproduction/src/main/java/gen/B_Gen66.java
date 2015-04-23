
  package gen;
  public class B_Gen66 {
  		@com.google.inject.Inject
  		public B_Gen66(B_Gen67 b_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
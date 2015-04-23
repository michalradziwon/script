
  package gen;
  public class B_Gen15 {
  		@com.google.inject.Inject
  		public B_Gen15(B_Gen16 b_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
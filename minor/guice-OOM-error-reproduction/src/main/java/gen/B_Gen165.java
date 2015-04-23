
  package gen;
  public class B_Gen165 {
  		@com.google.inject.Inject
  		public B_Gen165(B_Gen166 b_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
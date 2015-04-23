
  package gen;
  public class B_Gen164 {
  		@com.google.inject.Inject
  		public B_Gen164(B_Gen165 b_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
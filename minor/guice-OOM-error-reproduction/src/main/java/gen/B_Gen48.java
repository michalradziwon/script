
  package gen;
  public class B_Gen48 {
  		@com.google.inject.Inject
  		public B_Gen48(B_Gen49 b_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
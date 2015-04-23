
  package gen;
  public class B_Gen54 {
  		@com.google.inject.Inject
  		public B_Gen54(B_Gen55 b_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
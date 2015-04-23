
  package gen;
  public class S_Gen54 {
  		@com.google.inject.Inject
  		public S_Gen54(S_Gen55 s_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
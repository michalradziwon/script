
  package gen;
  public class T_Gen45 {
  		@com.google.inject.Inject
  		public T_Gen45(T_Gen46 t_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
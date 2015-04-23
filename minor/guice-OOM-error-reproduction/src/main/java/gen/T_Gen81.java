
  package gen;
  public class T_Gen81 {
  		@com.google.inject.Inject
  		public T_Gen81(T_Gen82 t_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
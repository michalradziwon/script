
  package gen;
  public class T_Gen115 {
  		@com.google.inject.Inject
  		public T_Gen115(T_Gen116 t_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  

  package gen;
  public class T_Gen116 {
  		@com.google.inject.Inject
  		public T_Gen116(T_Gen117 t_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
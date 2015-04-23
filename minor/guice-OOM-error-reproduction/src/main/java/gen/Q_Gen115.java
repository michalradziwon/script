
  package gen;
  public class Q_Gen115 {
  		@com.google.inject.Inject
  		public Q_Gen115(Q_Gen116 q_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
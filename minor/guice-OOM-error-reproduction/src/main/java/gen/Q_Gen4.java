
  package gen;
  public class Q_Gen4 {
  		@com.google.inject.Inject
  		public Q_Gen4(Q_Gen5 q_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
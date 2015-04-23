
  package gen;
  public class Q_Gen15 {
  		@com.google.inject.Inject
  		public Q_Gen15(Q_Gen16 q_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  

  package gen;
  public class M_Gen193 {
  		@com.google.inject.Inject
  		public M_Gen193(M_Gen194 m_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  